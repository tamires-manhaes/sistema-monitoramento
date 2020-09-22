package com.company;

public abstract class UnidadeMonitora {
  protected String id;
  protected PontoDeLocalizacao coordenadas;
  protected boolean video, termometro, medidorCO2, medidorch4;

  public UnidadeMonitora(String id, PontoDeLocalizacao local, boolean video, boolean termometro, boolean co2, boolean ch4){
    this.id = id;
    this.coordenadas = local;
    this.video = video;
    this.termometro = termometro;
    this.medidorCO2 = co2;
    this.medidorch4 = ch4;
  }

  public abstract double calcularDistancia(PontoDeLocalizacao destino);

  public boolean temConfiguracaoMinima(boolean video, boolean termometro, boolean medidorCO2, boolean medidorCH4){
//        if((!this.video == video) && (!this.termometro == termometro) && (!this.medidorCO2 == medidorCO2) && (!this.medidorch4 == medidorCH4)) {
//            return false;
//        }else {
//            return true;
//        }

    if(video){
      if(this.isVideo() != video){
        return false;
      }
    }
    if(termometro){
      if(this.isTermometro() != termometro){
        return false;
      }
    }
    if(medidorCO2){
      if(this.isMedidorCO2() != medidorCO2){
        return false;
      }
    }
    if(medidorCH4){
      if(this.isMedidorch4() != medidorCH4){
        return false;
      }
    }

    return true;
  }

  public boolean comparaCoordenadas(PontoDeLocalizacao destino){  return !this.getCoordenadas().equals(destino); }

  public boolean atualizarUnidade(PontoDeLocalizacao destino){
    if(this.comparaCoordenadas(destino)){
      this.setCoordenadas(destino);
      return true;
    }
    return false;
  }

  public boolean isVideo() {  return video; }

  public boolean isTermometro() {  return termometro; }

  public boolean isMedidorCO2() {  return medidorCO2; }

  public boolean isMedidorch4() {  return medidorch4; }

  public void setCoordenadas(PontoDeLocalizacao coordenadas) {  this.coordenadas = coordenadas; }

  public PontoDeLocalizacao getCoordenadas() { return coordenadas; }

  public String getId() {  return id; }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    UnidadeMonitora other = (UnidadeMonitora) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }
}