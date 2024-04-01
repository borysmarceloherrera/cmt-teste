package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LoteNotificacao
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T14:41:59.684722023Z[GMT]")


public class LoteNotificacao   {
  @JsonProperty("idLote")
  private Long idLote = null;

  @JsonProperty("periodoInicial")
  private LocalDate periodoInicial = null;

  @JsonProperty("periodoFinal")
  private LocalDate periodoFinal = null;

  @JsonProperty("dataAgendamentoNotificacao")
  private OffsetDateTime dataAgendamentoNotificacao = null;

  @JsonProperty("dataNotificacao")
  private OffsetDateTime dataNotificacao = null;

  /**
   * situacao do lote
   */
  public enum StatusEnum {
    CRIACAO("criacao"),
    
    NOTIFICACAO("notificacao"),
    
    NOTIFICADO("notificado");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("usuarioInclusao")
  private String usuarioInclusao = null;

  @JsonProperty("usuarioUltimaAlteracao")
  private String usuarioUltimaAlteracao = null;

  @JsonProperty("dataInclusao")
  private OffsetDateTime dataInclusao = null;

  @JsonProperty("dataUltimaAlteracao")
  private OffsetDateTime dataUltimaAlteracao = null;

  public LoteNotificacao idLote(Long idLote) {
    this.idLote = idLote;
    return this;
  }

  /**
   * Get idLote
   * @return idLote
   **/
  @Schema(example = "10", description = "")
  
    public Long getIdLote() {
    return idLote;
  }

  public void setIdLote(Long idLote) {
    this.idLote = idLote;
  }

  public LoteNotificacao periodoInicial(LocalDate periodoInicial) {
    this.periodoInicial = periodoInicial;
    return this;
  }

  /**
   * Get periodoInicial
   * @return periodoInicial
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getPeriodoInicial() {
    return periodoInicial;
  }

  public void setPeriodoInicial(LocalDate periodoInicial) {
    this.periodoInicial = periodoInicial;
  }

  public LoteNotificacao periodoFinal(LocalDate periodoFinal) {
    this.periodoFinal = periodoFinal;
    return this;
  }

  /**
   * Get periodoFinal
   * @return periodoFinal
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getPeriodoFinal() {
    return periodoFinal;
  }

  public void setPeriodoFinal(LocalDate periodoFinal) {
    this.periodoFinal = periodoFinal;
  }

  public LoteNotificacao dataAgendamentoNotificacao(OffsetDateTime dataAgendamentoNotificacao) {
    this.dataAgendamentoNotificacao = dataAgendamentoNotificacao;
    return this;
  }

  /**
   * Get dataAgendamentoNotificacao
   * @return dataAgendamentoNotificacao
   **/
  @Schema(description = "")
  
    @Valid
    public OffsetDateTime getDataAgendamentoNotificacao() {
    return dataAgendamentoNotificacao;
  }

  public void setDataAgendamentoNotificacao(OffsetDateTime dataAgendamentoNotificacao) {
    this.dataAgendamentoNotificacao = dataAgendamentoNotificacao;
  }

  public LoteNotificacao dataNotificacao(OffsetDateTime dataNotificacao) {
    this.dataNotificacao = dataNotificacao;
    return this;
  }

  /**
   * data da primeira ciencia
   * @return dataNotificacao
   **/
  @Schema(description = "data da primeira ciencia")
  
    @Valid
    public OffsetDateTime getDataNotificacao() {
    return dataNotificacao;
  }

  public void setDataNotificacao(OffsetDateTime dataNotificacao) {
    this.dataNotificacao = dataNotificacao;
  }

  public LoteNotificacao status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * situacao do lote
   * @return status
   **/
  @Schema(example = "em criacao", description = "situacao do lote")
  
    public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public LoteNotificacao usuarioInclusao(String usuarioInclusao) {
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

  public LoteNotificacao usuarioUltimaAlteracao(String usuarioUltimaAlteracao) {
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

  public LoteNotificacao dataInclusao(OffsetDateTime dataInclusao) {
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

  public LoteNotificacao dataUltimaAlteracao(OffsetDateTime dataUltimaAlteracao) {
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
    LoteNotificacao loteNotificacao = (LoteNotificacao) o;
    return Objects.equals(this.idLote, loteNotificacao.idLote) &&
        Objects.equals(this.periodoInicial, loteNotificacao.periodoInicial) &&
        Objects.equals(this.periodoFinal, loteNotificacao.periodoFinal) &&
        Objects.equals(this.dataAgendamentoNotificacao, loteNotificacao.dataAgendamentoNotificacao) &&
        Objects.equals(this.dataNotificacao, loteNotificacao.dataNotificacao) &&
        Objects.equals(this.status, loteNotificacao.status) &&
        Objects.equals(this.usuarioInclusao, loteNotificacao.usuarioInclusao) &&
        Objects.equals(this.usuarioUltimaAlteracao, loteNotificacao.usuarioUltimaAlteracao) &&
        Objects.equals(this.dataInclusao, loteNotificacao.dataInclusao) &&
        Objects.equals(this.dataUltimaAlteracao, loteNotificacao.dataUltimaAlteracao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idLote, periodoInicial, periodoFinal, dataAgendamentoNotificacao, dataNotificacao, status, usuarioInclusao, usuarioUltimaAlteracao, dataInclusao, dataUltimaAlteracao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoteNotificacao {\n");
    
    sb.append("    idLote: ").append(toIndentedString(idLote)).append("\n");
    sb.append("    periodoInicial: ").append(toIndentedString(periodoInicial)).append("\n");
    sb.append("    periodoFinal: ").append(toIndentedString(periodoFinal)).append("\n");
    sb.append("    dataAgendamentoNotificacao: ").append(toIndentedString(dataAgendamentoNotificacao)).append("\n");
    sb.append("    dataNotificacao: ").append(toIndentedString(dataNotificacao)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
