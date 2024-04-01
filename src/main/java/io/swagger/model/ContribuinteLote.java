package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContribuinteLote
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T14:41:59.684722023Z[GMT]")


public class ContribuinteLote   {
  @JsonProperty("idLote")
  private Long idLote = null;

  @JsonProperty("nuDocumentoEmitente")
  private String nuDocumentoEmitente = null;

  @JsonProperty("valorDIFAL")
  private BigDecimal valorDIFAL = null;

  @JsonProperty("valorFECEP")
  private BigDecimal valorFECEP = null;

  @JsonProperty("protNu")
  private String protNu = null;

  @JsonProperty("dataNotificacao")
  private OffsetDateTime dataNotificacao = null;

  @JsonProperty("usuarioInclusao")
  private String usuarioInclusao = null;

  @JsonProperty("usuarioUltimaAlteracao")
  private String usuarioUltimaAlteracao = null;

  @JsonProperty("dataInclusao")
  private OffsetDateTime dataInclusao = null;

  @JsonProperty("dataUltimaAlteracao")
  private OffsetDateTime dataUltimaAlteracao = null;

  public ContribuinteLote idLote(Long idLote) {
    this.idLote = idLote;
    return this;
  }

  /**
   * Get idLote
   * @return idLote
   **/
  @Schema(example = "100000", description = "")
  
    public Long getIdLote() {
    return idLote;
  }

  public void setIdLote(Long idLote) {
    this.idLote = idLote;
  }

  public ContribuinteLote nuDocumentoEmitente(String nuDocumentoEmitente) {
    this.nuDocumentoEmitente = nuDocumentoEmitente;
    return this;
  }

  /**
   * Get nuDocumentoEmitente
   * @return nuDocumentoEmitente
   **/
  @Schema(example = "fehguy", description = "")
  
    public String getNuDocumentoEmitente() {
    return nuDocumentoEmitente;
  }

  public void setNuDocumentoEmitente(String nuDocumentoEmitente) {
    this.nuDocumentoEmitente = nuDocumentoEmitente;
  }

  public ContribuinteLote valorDIFAL(BigDecimal valorDIFAL) {
    this.valorDIFAL = valorDIFAL;
    return this;
  }

  /**
   * Get valorDIFAL
   * @return valorDIFAL
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getValorDIFAL() {
    return valorDIFAL;
  }

  public void setValorDIFAL(BigDecimal valorDIFAL) {
    this.valorDIFAL = valorDIFAL;
  }

  public ContribuinteLote valorFECEP(BigDecimal valorFECEP) {
    this.valorFECEP = valorFECEP;
    return this;
  }

  /**
   * Get valorFECEP
   * @return valorFECEP
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getValorFECEP() {
    return valorFECEP;
  }

  public void setValorFECEP(BigDecimal valorFECEP) {
    this.valorFECEP = valorFECEP;
  }

  public ContribuinteLote protNu(String protNu) {
    this.protNu = protNu;
    return this;
  }

  /**
   * Get protNu
   * @return protNu
   **/
  @Schema(description = "")
  
    public String getProtNu() {
    return protNu;
  }

  public void setProtNu(String protNu) {
    this.protNu = protNu;
  }

  public ContribuinteLote dataNotificacao(OffsetDateTime dataNotificacao) {
    this.dataNotificacao = dataNotificacao;
    return this;
  }

  /**
   * Get dataNotificacao
   * @return dataNotificacao
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getDataNotificacao() {
    return dataNotificacao;
  }

  public void setDataNotificacao(OffsetDateTime dataNotificacao) {
    this.dataNotificacao = dataNotificacao;
  }

  public ContribuinteLote usuarioInclusao(String usuarioInclusao) {
    this.usuarioInclusao = usuarioInclusao;
    return this;
  }

  /**
   * Get usuarioInclusao
   * @return usuarioInclusao
   **/
  @Schema(description = "")
  
    public String getUsuarioInclusao() {
    return usuarioInclusao;
  }

  public void setUsuarioInclusao(String usuarioInclusao) {
    this.usuarioInclusao = usuarioInclusao;
  }

  public ContribuinteLote usuarioUltimaAlteracao(String usuarioUltimaAlteracao) {
    this.usuarioUltimaAlteracao = usuarioUltimaAlteracao;
    return this;
  }

  /**
   * Get usuarioUltimaAlteracao
   * @return usuarioUltimaAlteracao
   **/
  @Schema(description = "")
  
    public String getUsuarioUltimaAlteracao() {
    return usuarioUltimaAlteracao;
  }

  public void setUsuarioUltimaAlteracao(String usuarioUltimaAlteracao) {
    this.usuarioUltimaAlteracao = usuarioUltimaAlteracao;
  }

  public ContribuinteLote dataInclusao(OffsetDateTime dataInclusao) {
    this.dataInclusao = dataInclusao;
    return this;
  }

  /**
   * Get dataInclusao
   * @return dataInclusao
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getDataInclusao() {
    return dataInclusao;
  }

  public void setDataInclusao(OffsetDateTime dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  public ContribuinteLote dataUltimaAlteracao(OffsetDateTime dataUltimaAlteracao) {
    this.dataUltimaAlteracao = dataUltimaAlteracao;
    return this;
  }

  /**
   * Get dataUltimaAlteracao
   * @return dataUltimaAlteracao
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getDataUltimaAlteracao() {
    return dataUltimaAlteracao;
  }

  public void setDataUltimaAlteracao(OffsetDateTime dataUltimaAlteracao) {
    this.dataUltimaAlteracao = dataUltimaAlteracao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContribuinteLote contribuinteLote = (ContribuinteLote) o;
    return Objects.equals(this.idLote, contribuinteLote.idLote) &&
        Objects.equals(this.nuDocumentoEmitente, contribuinteLote.nuDocumentoEmitente) &&
        Objects.equals(this.valorDIFAL, contribuinteLote.valorDIFAL) &&
        Objects.equals(this.valorFECEP, contribuinteLote.valorFECEP) &&
        Objects.equals(this.protNu, contribuinteLote.protNu) &&
        Objects.equals(this.dataNotificacao, contribuinteLote.dataNotificacao) &&
        Objects.equals(this.usuarioInclusao, contribuinteLote.usuarioInclusao) &&
        Objects.equals(this.usuarioUltimaAlteracao, contribuinteLote.usuarioUltimaAlteracao) &&
        Objects.equals(this.dataInclusao, contribuinteLote.dataInclusao) &&
        Objects.equals(this.dataUltimaAlteracao, contribuinteLote.dataUltimaAlteracao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idLote, nuDocumentoEmitente, valorDIFAL, valorFECEP, protNu, dataNotificacao, usuarioInclusao, usuarioUltimaAlteracao, dataInclusao, dataUltimaAlteracao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContribuinteLote {\n");
    
    sb.append("    idLote: ").append(toIndentedString(idLote)).append("\n");
    sb.append("    nuDocumentoEmitente: ").append(toIndentedString(nuDocumentoEmitente)).append("\n");
    sb.append("    valorDIFAL: ").append(toIndentedString(valorDIFAL)).append("\n");
    sb.append("    valorFECEP: ").append(toIndentedString(valorFECEP)).append("\n");
    sb.append("    protNu: ").append(toIndentedString(protNu)).append("\n");
    sb.append("    dataNotificacao: ").append(toIndentedString(dataNotificacao)).append("\n");
    sb.append("    usuarioInclusao: ").append(toIndentedString(usuarioInclusao)).append("\n");
    sb.append("    usuarioUltimaAlteracao: ").append(toIndentedString(usuarioUltimaAlteracao)).append("\n");
    sb.append("    dataInclusao: ").append(toIndentedString(dataInclusao)).append("\n");
    sb.append("    dataUltimaAlteracao: ").append(toIndentedString(dataUltimaAlteracao)).append("\n");
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
