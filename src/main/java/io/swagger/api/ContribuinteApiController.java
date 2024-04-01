package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.ContribuinteLote;
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
public class ContribuinteApiController implements ContribuinteApi {

    private static final Logger log = LoggerFactory.getLogger(ContribuinteApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ContribuinteApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ContribuinteLote> addcontribuinte(@Parameter(in = ParameterIn.DEFAULT, description = "Create a new contribuinte in the contribuinte", required=true, schema=@Schema()) @Valid @RequestBody ContribuinteLote body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContribuinteLote>(objectMapper.readValue("{\n  \"usuarioInclusao\" : \"usuarioInclusao\",\n  \"dataUltimaAlteracao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"valorFECEP\" : 6.027456183070403,\n  \"protNu\" : \"protNu\",\n  \"dataInclusao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dataNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"valorDIFAL\" : 0.8008281904610115,\n  \"idLote\" : 100000,\n  \"nuDocumentoEmitente\" : \"fehguy\",\n  \"usuarioUltimaAlteracao\" : \"usuarioUltimaAlteracao\"\n}", ContribuinteLote.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContribuinteLote>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContribuinteLote>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ContribuinteLote>> findcontribuintesByStatus(@Parameter(in = ParameterIn.QUERY, description = "Status values that need to be considered for filter" ,schema=@Schema(allowableValues={ "available", "pending", "sold" }
, defaultValue="available")) @Valid @RequestParam(value = "status", required = false, defaultValue="available") String status
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ContribuinteLote>>(objectMapper.readValue("[ {\n  \"usuarioInclusao\" : \"usuarioInclusao\",\n  \"dataUltimaAlteracao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"valorFECEP\" : 6.027456183070403,\n  \"protNu\" : \"protNu\",\n  \"dataInclusao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dataNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"valorDIFAL\" : 0.8008281904610115,\n  \"idLote\" : 100000,\n  \"nuDocumentoEmitente\" : \"fehguy\",\n  \"usuarioUltimaAlteracao\" : \"usuarioUltimaAlteracao\"\n}, {\n  \"usuarioInclusao\" : \"usuarioInclusao\",\n  \"dataUltimaAlteracao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"valorFECEP\" : 6.027456183070403,\n  \"protNu\" : \"protNu\",\n  \"dataInclusao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dataNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"valorDIFAL\" : 0.8008281904610115,\n  \"idLote\" : 100000,\n  \"nuDocumentoEmitente\" : \"fehguy\",\n  \"usuarioUltimaAlteracao\" : \"usuarioUltimaAlteracao\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ContribuinteLote>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ContribuinteLote>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ContribuinteLote> getcontribuinteById(@Parameter(in = ParameterIn.PATH, description = "ID of contribuinte to return", required=true, schema=@Schema()) @PathVariable("contribuinteId") Long contribuinteId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContribuinteLote>(objectMapper.readValue("{\n  \"usuarioInclusao\" : \"usuarioInclusao\",\n  \"dataUltimaAlteracao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"valorFECEP\" : 6.027456183070403,\n  \"protNu\" : \"protNu\",\n  \"dataInclusao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dataNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"valorDIFAL\" : 0.8008281904610115,\n  \"idLote\" : 100000,\n  \"nuDocumentoEmitente\" : \"fehguy\",\n  \"usuarioUltimaAlteracao\" : \"usuarioUltimaAlteracao\"\n}", ContribuinteLote.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContribuinteLote>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContribuinteLote>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ContribuinteLote> updatecontribuinte(@Parameter(in = ParameterIn.DEFAULT, description = "Update an existent contribuinte in the contribuinte", required=true, schema=@Schema()) @Valid @RequestBody ContribuinteLote body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ContribuinteLote>(objectMapper.readValue("{\n  \"usuarioInclusao\" : \"usuarioInclusao\",\n  \"dataUltimaAlteracao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"valorFECEP\" : 6.027456183070403,\n  \"protNu\" : \"protNu\",\n  \"dataInclusao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dataNotificacao\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"valorDIFAL\" : 0.8008281904610115,\n  \"idLote\" : 100000,\n  \"nuDocumentoEmitente\" : \"fehguy\",\n  \"usuarioUltimaAlteracao\" : \"usuarioUltimaAlteracao\"\n}", ContribuinteLote.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ContribuinteLote>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ContribuinteLote>(HttpStatus.NOT_IMPLEMENTED);
    }

}
