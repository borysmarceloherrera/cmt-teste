package io.swagger.api;

import org.threeten.bp.LocalDate;
import io.swagger.model.LoteGrid;
import io.swagger.model.LoteNotificacao;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-04-01T14:41:59.684722023Z[GMT]")
@RestController
public class LoteApiController implements LoteApi {

    private static final Logger log = LoggerFactory.getLogger(LoteApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LoteApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<LoteNotificacao> addlote(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new lote in the contribuinte", required=true, schema=@Schema()) @Valid @RequestBody LoteNotificacao body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LoteNotificacao>(objectMapper.readValue("{\n  \"usuarioInclusao\" : \"usuarioInclusao\",\n  \"dataUltimaAlteracao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"periodoFinal\" : \"2000-01-23\",\n  \"dataInclusao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dataAgendamentoNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dataNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"idLote\" : 10,\n  \"periodoInicial\" : \"2000-01-23\",\n  \"status\" : \"em criacao\",\n  \"usuarioUltimaAlteracao\" : \"usuarioUltimaAlteracao\"\n}", LoteNotificacao.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LoteNotificacao>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LoteNotificacao>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<LoteGrid>> consultarPorFiltroLote(@Parameter(in = ParameterIn.HEADER, description = "data do período inicial" ,required=true,schema=@Schema()) @RequestHeader(value="dataInicial", required=true) String dataInicial
,@Parameter(in = ParameterIn.HEADER, description = "data do período final" ,required=true,schema=@Schema()) @RequestHeader(value="dataFinal", required=true) String dataFinal
,@Parameter(in = ParameterIn.HEADER, description = "ID do lote" ,required=true,schema=@Schema()) @RequestHeader(value="idLote", required=true) String idLote
,@Parameter(in = ParameterIn.HEADER, description = "Total de registros por página" ,required=true,schema=@Schema()) @RequestHeader(value="totalRegistrosPagina", required=true) String totalRegistrosPagina
,@Parameter(in = ParameterIn.HEADER, description = "Número da página atual" ,required=true,schema=@Schema()) @RequestHeader(value="paginaAtual", required=true) String paginaAtual
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<LoteGrid>>(objectMapper.readValue("[ {\n  \"vlTotal\" : \"vlTotal\",\n  \"situacaoLote\" : \"situacaoLote\",\n  \"periodoFinal\" : \"periodoFinal\",\n  \"qtdContribuintes\" : \"qtdContribuintes\",\n  \"dataAgendamentoNotificacao\" : \"dataAgendamentoNotificacao\",\n  \"dataNotificacao\" : \"dataNotificacao\",\n  \"vlDifal\" : \"vlDifal\",\n  \"idLote\" : \"idLote\",\n  \"periodoInicial\" : \"periodoInicial\",\n  \"vlFecep\" : \"vlFecep\"\n}, {\n  \"vlTotal\" : \"vlTotal\",\n  \"situacaoLote\" : \"situacaoLote\",\n  \"periodoFinal\" : \"periodoFinal\",\n  \"qtdContribuintes\" : \"qtdContribuintes\",\n  \"dataAgendamentoNotificacao\" : \"dataAgendamentoNotificacao\",\n  \"dataNotificacao\" : \"dataNotificacao\",\n  \"vlDifal\" : \"vlDifal\",\n  \"idLote\" : \"idLote\",\n  \"periodoInicial\" : \"periodoInicial\",\n  \"vlFecep\" : \"vlFecep\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<LoteGrid>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<LoteGrid>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<LoteGrid>> consultarPorId(@Parameter(in = ParameterIn.PATH, description = "ID do lote", required=true, schema=@Schema()) @PathVariable("idLote") String idLote
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<LoteGrid>>(objectMapper.readValue("[ {\n  \"vlTotal\" : \"vlTotal\",\n  \"situacaoLote\" : \"situacaoLote\",\n  \"periodoFinal\" : \"periodoFinal\",\n  \"qtdContribuintes\" : \"qtdContribuintes\",\n  \"dataAgendamentoNotificacao\" : \"dataAgendamentoNotificacao\",\n  \"dataNotificacao\" : \"dataNotificacao\",\n  \"vlDifal\" : \"vlDifal\",\n  \"idLote\" : \"idLote\",\n  \"periodoInicial\" : \"periodoInicial\",\n  \"vlFecep\" : \"vlFecep\"\n}, {\n  \"vlTotal\" : \"vlTotal\",\n  \"situacaoLote\" : \"situacaoLote\",\n  \"periodoFinal\" : \"periodoFinal\",\n  \"qtdContribuintes\" : \"qtdContribuintes\",\n  \"dataAgendamentoNotificacao\" : \"dataAgendamentoNotificacao\",\n  \"dataNotificacao\" : \"dataNotificacao\",\n  \"vlDifal\" : \"vlDifal\",\n  \"idLote\" : \"idLote\",\n  \"periodoInicial\" : \"periodoInicial\",\n  \"vlFecep\" : \"vlFecep\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<LoteGrid>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<LoteGrid>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<LoteNotificacao>> findlotesByStatus(@Parameter(in = ParameterIn.QUERY, description = "Status values that need to be considered for filter" ,schema=@Schema(allowableValues={ "available", "pending", "sold" }
, defaultValue="available")) @Valid @RequestParam(value = "status", required = false, defaultValue="available") String status
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<LoteNotificacao>>(objectMapper.readValue("[ {\n  \"usuarioInclusao\" : \"usuarioInclusao\",\n  \"dataUltimaAlteracao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"periodoFinal\" : \"2000-01-23\",\n  \"dataInclusao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dataAgendamentoNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dataNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"idLote\" : 10,\n  \"periodoInicial\" : \"2000-01-23\",\n  \"status\" : \"em criacao\",\n  \"usuarioUltimaAlteracao\" : \"usuarioUltimaAlteracao\"\n}, {\n  \"usuarioInclusao\" : \"usuarioInclusao\",\n  \"dataUltimaAlteracao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"periodoFinal\" : \"2000-01-23\",\n  \"dataInclusao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dataAgendamentoNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dataNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"idLote\" : 10,\n  \"periodoInicial\" : \"2000-01-23\",\n  \"status\" : \"em criacao\",\n  \"usuarioUltimaAlteracao\" : \"usuarioUltimaAlteracao\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<LoteNotificacao>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<LoteNotificacao>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<LoteNotificacao> updatelote(@Parameter(in = ParameterIn.DEFAULT, description = "Update an existent lote in the contribuinte", required=true, schema=@Schema()) @Valid @RequestBody LoteNotificacao body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<LoteNotificacao>(objectMapper.readValue("{\n  \"usuarioInclusao\" : \"usuarioInclusao\",\n  \"dataUltimaAlteracao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"periodoFinal\" : \"2000-01-23\",\n  \"dataInclusao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dataAgendamentoNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dataNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"idLote\" : 10,\n  \"periodoInicial\" : \"2000-01-23\",\n  \"status\" : \"em criacao\",\n  \"usuarioUltimaAlteracao\" : \"usuarioUltimaAlteracao\"\n}", LoteNotificacao.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<LoteNotificacao>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<LoteNotificacao>(HttpStatus.NOT_IMPLEMENTED);
    }

}
