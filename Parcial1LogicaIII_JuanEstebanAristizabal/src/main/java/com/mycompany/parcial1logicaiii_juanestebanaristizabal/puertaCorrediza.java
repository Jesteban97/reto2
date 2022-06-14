/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial1logicaiii_juanestebanaristizabal;

/**
 *
 * @author GIS_Soporte
 */
public class puertaCorrediza {
    
    private String modoOperacion = "Manual";
    private int countOpen = 0;
    private boolean objetoEnVia = false;
    private boolean abierta = false;
    private String hora = "00:00";

    public puertaCorrediza(String modoOperacion, int countOpen, boolean objetoEnVia) {
        this.modoOperacion = modoOperacion;
        this.countOpen = countOpen;
        this.objetoEnVia = objetoEnVia;
    }

    public puertaCorrediza() {
    }

    public void cambiarModoOperacion(String modo){
        setModoOperacion(modo);
        System.out.println("Ahora la puerta esta en modo" + modo);
    }
    
    public void abrirPuerta(){
        if(isAbierta()==true){
            System.out.println("La puerta ya esta abierta");
        }
        else if(isAbierta()==false && isObjetoEnVia()==true){
            System.out.println("Hay un objeto en la vía");
        }
        else{
            setAbierta(true);
            setCountOpen(getCountOpen()+1);
            System.out.println("Se abrio la puerta");
        }
    }
    
    public void cerrarPuerta(){
        if(isAbierta()==false){
            System.out.println("La puerta ya esta cerrada");
        }
        else if(isAbierta()==true && isObjetoEnVia()==true){
            System.out.println("Hay un objeto en la vía");
            cerrarPuerta();
        }
        else{
            setAbierta(false);
            System.out.println("Se cerro la puerta");
        }
    }
    
    public void contarVeces(){
        System.out.println("la puerta se ha abierto "+getCountOpen()+ " veces");
    }
    
    public void contarVecesAbiertaDia(){
        System.out.println("La puerta se abrio: "+getCountOpen());
        setCountOpen(0);
    }
    
    public String getModoOperacion() {
        return modoOperacion;
    }

    public int getCountOpen() {
        return countOpen;
    }

    public boolean isObjetoEnVia() {
        return objetoEnVia;
    }

    public void setModoOperacion(String modoOperacion) {
        this.modoOperacion = modoOperacion;
    }

    public void setCountOpen(int countOpen) {
        this.countOpen = countOpen;
    }

    public void setObjetoEnVia(boolean objetoEnVia) {
        this.objetoEnVia = objetoEnVia;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    
    
    
    
    
    
}
