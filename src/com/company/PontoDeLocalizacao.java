package com.company;

public class PontoDeLocalizacao {
  private double abcissa, ordenada;

  public PontoDeLocalizacao(double abcissa, double ordenada){
    this.abcissa = abcissa;
    this.ordenada = ordenada;
  }

  public double getAbcissa() {  return abcissa; }

  public double getOrdenada() {  return ordenada; }

  @Override
  public String toString() {  return "Localizacao [abscissa=" + abcissa + ", ordenada=" + ordenada + "]"; }

  public boolean equals(PontoDeLocalizacao diffLocalizacao){
    if(!(diffLocalizacao instanceof  PontoDeLocalizacao)){  return false; }

    PontoDeLocalizacao destino = diffLocalizacao;
    double abscissaDiff = Double.compare(this.getAbcissa(), destino.getAbcissa());
    double ordenadaDiff = Double.compare(this.getOrdenada(), destino.getOrdenada());
    return abscissaDiff == 0.0 && ordenadaDiff == 0.0;
  }
}