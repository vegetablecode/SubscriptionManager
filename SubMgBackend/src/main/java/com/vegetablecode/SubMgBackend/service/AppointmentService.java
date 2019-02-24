package com.vegetablecode.SubMgBackend.service;

import com.vegetablecode.SubMgBackend.domain.Agreement;
import com.vegetablecode.SubMgBackend.domain.Appointment;
import com.vegetablecode.SubMgBackend.domain.Task;
import com.vegetablecode.SubMgBackend.exceptions.ClientNotFoundException;
import com.vegetablecode.SubMgBackend.repository.AgreementRepository;
import com.vegetablecode.SubMgBackend.repository.AppointmentRepository;
import com.vegetablecode.SubMgBackend.repository.ClientRepository;
import com.vegetablecode.SubMgBackend.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired
    private AgreementRepository agreementRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private ClientRepository clientRepository;

    public Appointment addAppointment(String clientIdentifier, Appointment appointment) {
        try {
            Agreement agreement = agreementRepository.findByClientIdentifier(clientIdentifier);
            appointment.setAgreement(agreement);
            appointment.setClientIdentifier(clientIdentifier);
            return appointmentRepository.save(appointment);
        } catch (Exception e) {
            throw new ClientNotFoundException("Client '" + clientIdentifier + "' not Found!");
        }
    }

}
