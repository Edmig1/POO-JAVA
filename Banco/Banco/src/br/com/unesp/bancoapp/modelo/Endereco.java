package br.com.unesp.bancoapp.modelo;

public class Endereco {
    private String rua, numero, bairro, cidade, estado, cep;
    public Endereco(String rua,String numero,String bairro,String cidade,String estado,String cep){
        this.rua=rua; this.numero=numero; this.bairro=bairro; this.cidade=cidade; this.estado=estado; this.cep=cep;
    }
    public String toString(){
        return rua+", "+numero+", "+bairro+", "+cidade+"-"+estado+", CEP: "+cep;
    }
}