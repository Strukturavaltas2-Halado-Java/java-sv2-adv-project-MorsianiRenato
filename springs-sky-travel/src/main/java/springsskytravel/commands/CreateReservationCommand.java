package springsskytravel.commands;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import springsskytravel.model.Participant;
import springsskytravel.model.Reservation;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class CreateReservationCommand {

    @NotBlank(message = "Contact Name must be provided")
    @Schema(description = "Contact name", example = "John Doe")
    private String contactPerson;

    @NotNull(message = "Requested Service must be present")
    @Schema(description = "Type of service", example = "HALF_BOARD")
    private Reservation.Service requestedService;

    @Size(min = 1, message = "At least one participant must be added")
    @NotNull(message = "Participant list must be present")
    @Schema(description = "List of participants")
    private List<Participant> participants;

    @NotNull(message = "Journey Id must be provided")
    @Schema(description = "Journey ID", example = "1")
    private Long journeyId;
}
