package se.salt.dev.jfs22.backend.model;

public record ProfessionalDTO (
        String professionalName,
        String professionalAddress,
        String professionalRating,
        String professionalService,
        long professionalPrice,
        String professionalImage
){
}
