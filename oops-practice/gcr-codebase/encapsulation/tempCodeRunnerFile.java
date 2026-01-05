public void viewRecord(List<Patient> patients) {
        System.out.println("Viewing medical records for patient ID: " + patientId);
        for(Patient p:patients) {
            System.out.println(p.displayPatientInfo());
        }
    }