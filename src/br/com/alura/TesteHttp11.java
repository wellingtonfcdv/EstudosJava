package br.com.alura;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TesteHttp11 {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {

//		URL url = new URL("https://www.casadocodigo.com.br");
//		URLConnection uc = url.openConnection();
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
//
//		String line = "";
//
//		while (br.readLine() != null) {
//			line = line.concat(br.readLine()).concat(System.lineSeparator());
//		}
//
//		System.out.println(line);
		
		//credenciais proxy
		String username = "do-user";
		String password = "1234";
		
		//configuração do cliente com proxy e autenticação
		HttpClient client = HttpClient.newBuilder()
				.proxy(ProxySelector.of(new InetSocketAddress("10.26.0.159", 8080)))
				.authenticator(new Authenticator() {
					@Override
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password.toCharArray());
					}
				})
				.build();
		
		//criação da requisição
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://www.casadocodigo.com.br"))
				.GET()
				.build();
		
		//Envio da requisição e obtenção da resposta
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		//Exibe o corpo da resposta
		System.out.println(response.statusCode());
		System.out.println(response.version());
	}
}
