export class Negociacao{
   

    constructor(
        private _data: Date, 
        public readonly quantidade: number, 
        public readonly valor: number){}



    
    get volume(): number{
        return this.quantidade * this.valor;
    }
}