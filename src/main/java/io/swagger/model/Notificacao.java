package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Notificacao
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T14:41:59.684722023Z[GMT]")


public class Notificacao   {
  @JsonProperty("idLote")
  private Long idLote = null;

  @JsonProperty("evento")
  private String evento = null;

  @JsonProperty("periodoInicial")
  private LocalDate periodoInicial = null;

  @JsonProperty("periodoFinal")
  private LocalDate periodoFinal = null;

  @JsonProperty("dataAgendamentoNotificacao")
  private OffsetDateTime dataAgendamentoNotificacao = null;

  public Notificacao idLote(Long idLote) {
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

  public Notificacao evento(String evento) {
    this.evento = evento;
    return this;
  }

  /**
   * Get evento
   * @return evento
   **/
  @Schema(example = "fehguy", description = "")
  
    public String getEvento() {
    return evento;
  }

  public void setEvento(String evento) {
    this.evento = evento;
  }

  public Notificacao periodoInicial(LocalDate periodoInicial) {
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

  public Notificacao periodoFinal(LocalDate periodoFinal) {
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

  public Notificacao dataAgendamentoNotificacao(OffsetDateTime dataAgendamentoNotificacao) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notificacao notificacao = (Notificacao) o;
    return Objects.equals(this.idLote, notificacao.idLote) &&
        Objects.equals(this.evento, notificacao.evento) &&
        Objects.equals(this.periodoInicial, notificacao.periodoInicial) &&
        Objects.equals(this.periodoFinal, notificacao.periodoFinal) &&
        Objects.equals(this.dataAgendamentoNotificacao, notificacao.dataAgendamentoNotificacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idLote, evento, periodoInicial, periodoFinal, dataAgendamentoNotificacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notificacao {\n");
    
    sb.append("    idLote: ").append(toIndentedString(idLote)).append("\n");
    sb.append("    evento: ").append(toIndentedString(evento)).append("\n");
    sb.append("    periodoInicial: ").append(toIndentedString(periodoInicial)).append("\n");
    sb.append("    periodoFinal: ").append(toIndentedString(periodoFinal)).append("\n");
    sb.append("    dataAgendamentoNotificacao: ").append(toIndentedString(dataAgendamentoNotificacao)).append("\n");
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
