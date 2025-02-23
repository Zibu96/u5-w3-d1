package giovannighirardelli.u5w3d1.payloads;

import giovannighirardelli.u5w3d1.enums.Stato;
import giovannighirardelli.u5w3d1.enums.Tipologia;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record NewDispositiviDTO(

        @NotNull(message = "Il dispositivo deve avere una tipologia")
        Tipologia tipologia,
        @NotNull(message = "Il dispositivo deve avere uno stato")
        Stato stato,
        UUID dipendentiId

) {
}
