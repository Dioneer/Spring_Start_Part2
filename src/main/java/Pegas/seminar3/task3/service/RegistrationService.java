package Pegas.seminar3.task3.service;

import lombok.RequiredArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Value
public class RegistrationService {
    private final DataProcessingService dataProcessingService;
}
