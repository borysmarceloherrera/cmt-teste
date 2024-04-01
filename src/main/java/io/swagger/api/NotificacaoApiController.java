package io.swagger.api;

import org.threeten.bp.LocalDate;
import io.swagger.model.Notificacao;
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
public class NotificacaoApiController implements NotificacaoApi {

    private static final Logger log = LoggerFactory.getLogger(NotificacaoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public NotificacaoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Notificacao> addnotificacao(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new notificacao in the notificacao", required=true, schema=@Schema()) @Valid @RequestBody Notificacao body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Notificacao>(objectMapper.readValue("{\n  \"evento\" : \"fehguy\",\n  \"periodoFinal\" : \"2000-01-23\",\n  \"dataAgendamentoNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"idLote\" : 100000,\n  \"periodoInicial\" : \"2000-01-23\"\n}", Notificacao.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Notificacao>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Notificacao>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Notificacao>> findnotificacaosByStatus(@Parameter(in = ParameterIn.QUERY, description = "Status values that need to be considered for filter" ,schema=@Schema(allowableValues={ "available", "pending", "sold" }
, defaultValue="available")) @Valid @RequestParam(value = "status", required = false, defaultValue="available") String status
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Notificacao>>(objectMapper.readValue("[ {\n  \"evento\" : \"fehguy\",\n  \"periodoFinal\" : \"2000-01-23\",\n  \"dataAgendamentoNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"idLote\" : 100000,\n  \"periodoInicial\" : \"2000-01-23\"\n}, {\n  \"evento\" : \"fehguy\",\n  \"periodoFinal\" : \"2000-01-23\",\n  \"dataAgendamentoNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"idLote\" : 100000,\n  \"periodoInicial\" : \"2000-01-23\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Notificacao>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Notificacao>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Notificacao> getnotificacaoById(@Parameter(in = ParameterIn.PATH, description = "ID of notificacao to return", required=true, schema=@Schema()) @PathVariable("notificacaoId") Long notificacaoId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Notificacao>(objectMapper.readValue("{\n  \"evento\" : \"fehguy\",\n  \"periodoFinal\" : \"2000-01-23\",\n  \"dataAgendamentoNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"idLote\" : 100000,\n  \"periodoInicial\" : \"2000-01-23\"\n}", Notificacao.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Notificacao>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Notificacao>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Notificacao> updatenotificacao(@Parameter(in = ParameterIn.DEFAULT, description = "Update an existent notificacao in the notificacao", required=true, schema=@Schema()) @Valid @RequestBody Notificacao body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Notificacao>(objectMapper.readValue("{\n  \"evento\" : \"fehguy\",\n  \"periodoFinal\" : \"2000-01-23\",\n  \"dataAgendamentoNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"idLote\" : 100000,\n  \"periodoInicial\" : \"2000-01-23\"\n}", Notificacao.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Notificacao>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Notificacao>(HttpStatus.NOT_IMPLEMENTED);
    }

}
