package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LoteGrid
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T14:41:59.684722023Z[GMT]")


public class LoteGrid   {
  @JsonProperty("idLote")
  private String idLote = null;

  @JsonProperty("periodoInicial")
  private String periodoInicial = null;

  @JsonProperty("periodoFinal")
  private String periodoFinal = null;

  @JsonProperty("qtdContribuintes")
  private String qtdContribuintes = null;

  @JsonProperty("vlDifal")
  private String vlDifal = null;

  @JsonProperty("vlFecep")
  private String vlFecep = null;

  @JsonProperty("vlTotal")
  private String vlTotal = null;

  @JsonProperty("situacaoLote")
  private String situacaoLote = null;

  @JsonProperty("dataAgendamentoNotificacao")
  private String dataAgendamentoNotificacao = null;

  @JsonProperty("dataNotificacao")
  private String dataNotificacao = null;

  public LoteGrid idLote(String idLote) {
    this.idLote = idLote;
    return this;
  }

  /**
   * Get idLote
   * @return idLote
   **/
  @Schema(description = "")
  
    public String getIdLote() {
    return idLote;
  }

  public void setIdLote(String idLote) {
    this.idLote = idLote;
  }

  public LoteGrid periodoInicial(String periodoInicial) {
    this.periodoInicial = periodoInicial;
    return this;
  }

  /**
   * Get periodoInicial
   * @return periodoInicial
   **/
  @Schema(description = "")
  
    public String getPeriodoInicial() {
    return periodoInicial;
  }

  public void setPeriodoInicial(String periodoInicial) {
    this.periodoInicial = periodoInicial;
  }

  public LoteGrid periodoFinal(String periodoFinal) {
    this.periodoFinal = periodoFinal;
    return this;
  }

  /**
   * Get periodoFinal
   * @return periodoFinal
   **/
  @Schema(description = "")
  
    public String getPeriodoFinal() {
    return periodoFinal;
  }

  public void setPeriodoFinal(String periodoFinal) {
    this.periodoFinal = periodoFinal;
  }

  public LoteGrid qtdContribuintes(String qtdContribuintes) {
    this.qtdContribuintes = qtdContribuintes;
    return this;
  }

  /**
   * Get qtdContribuintes
   * @return qtdContribuintes
   **/
  @Schema(description = "")
  
    public String getQtdContribuintes() {
    return qtdContribuintes;
  }

  public void setQtdContribuintes(String qtdContribuintes) {
    this.qtdContribuintes = qtdContribuintes;
  }

  public LoteGrid vlDifal(String vlDifal) {
    this.vlDifal = vlDifal;
    return this;
  }

  /**
   * Get vlDifal
   * @return vlDifal
   **/
  @Schema(description = "")
  
    public String getVlDifal() {
    return vlDifal;
  }

  public void setVlDifal(String vlDifal) {
    this.vlDifal = vlDifal;
  }

  public LoteGrid vlFecep(String vlFecep) {
    this.vlFecep = vlFecep;
    return this;
  }

  /**
   * Get vlFecep
   * @return vlFecep
   **/
  @Schema(description = "")
  
    public String getVlFecep() {
    return vlFecep;
  }

  public void setVlFecep(String vlFecep) {
    this.vlFecep = vlFecep;
  }

  public LoteGrid vlTotal(String vlTotal) {
    this.vlTotal = vlTotal;
    return this;
  }

  /**
   * Get vlTotal
   * @return vlTotal
   **/
  @Schema(description = "")
  
    public String getVlTotal() {
    return vlTotal;
  }

  public void setVlTotal(String vlTotal) {
    this.vlTotal = vlTotal;
  }

  public LoteGrid situacaoLote(String situacaoLote) {
    this.situacaoLote = situacaoLote;
    return this;
  }

  /**
   * Get situacaoLote
   * @return situacaoLote
   **/
  @Schema(description = "")
  
    public String getSituacaoLote() {
    return situacaoLote;
  }

  public void setSituacaoLote(String situacaoLote) {
    this.situacaoLote = situacaoLote;
  }

  public LoteGrid dataAgendamentoNotificacao(String dataAgendamentoNotificacao) {
    this.dataAgendamentoNotificacao = dataAgendamentoNotificacao;
    return this;
  }

  /**
   * Get dataAgendamentoNotificacao
   * @return dataAgendamentoNotificacao
   **/
  @Schema(description = "")
  
    public String getDataAgendamentoNotificacao() {
    return dataAgendamentoNotificacao;
  }

  public void setDataAgendamentoNotificacao(String dataAgendamentoNotificacao) {
    this.dataAgendamentoNotificacao = dataAgendamentoNotificacao;
  }

  public LoteGrid dataNotificacao(String dataNotificacao) {
    this.dataNotificacao = dataNotificacao;
    return this;
  }

  /**
   * Get dataNotificacao
   * @return dataNotificacao
   **/
  @Schema(description = "")
  
    public String getDataNotificacao() {
    return dataNotificacao;
  }

  public void setDataNotificacao(String dataNotificacao) {
    this.dataNotificacao = dataNotificacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoteGrid loteGrid = (LoteGrid) o;
    return Objects.equals(this.idLote, loteGrid.idLote) &&
        Objects.equals(this.periodoInicial, loteGrid.periodoInicial) &&
        Objects.equals(this.periodoFinal, loteGrid.periodoFinal) &&
        Objects.equals(this.qtdContribuintes, loteGrid.qtdContribuintes) &&
        Objects.equals(this.vlDifal, loteGrid.vlDifal) &&
        Objects.equals(this.vlFecep, loteGrid.vlFecep) &&
        Objects.equals(this.vlTotal, loteGrid.vlTotal) &&
        Objects.equals(this.situacaoLote, loteGrid.situacaoLote) &&
        Objects.equals(this.dataAgendamentoNotificacao, loteGrid.dataAgendamentoNotificacao) &&
        Objects.equals(this.dataNotificacao, loteGrid.dataNotificacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idLote, periodoInicial, periodoFinal, qtdContribuintes, vlDifal, vlFecep, vlTotal, situacaoLote, dataAgendamentoNotificacao, dataNotificacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoteGrid {\n");
    
    sb.append("    idLote: ").append(toIndentedString(idLote)).append("\n");
    sb.append("    periodoInicial: ").append(toIndentedString(periodoInicial)).append("\n");
    sb.append("    periodoFinal: ").append(toIndentedString(periodoFinal)).append("\n");
    sb.append("    qtdContribuintes: ").append(toIndentedString(qtdContribuintes)).append("\n");
    sb.append("    vlDifal: ").append(toIndentedString(vlDifal)).append("\n");
    sb.append("    vlFecep: ").append(toIndentedString(vlFecep)).append("\n");
    sb.append("    vlTotal: ").append(toIndentedString(vlTotal)).append("\n");
    sb.append("    situacaoLote: ").append(toIndentedString(situacaoLote)).append("\n");
    sb.append("    dataAgendamentoNotificacao: ").append(toIndentedString(dataAgendamentoNotificacao)).append("\n");
    sb.append("    dataNotificacao: ").append(toIndentedString(dataNotificacao)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
