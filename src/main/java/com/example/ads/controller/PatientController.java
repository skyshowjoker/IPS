package com.example.ads.controller;



import com.example.ads.domain.Patient;
import com.example.ads.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo")
public class PatientController {
    @Autowired
    PatientRepository patientRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewPatient (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Patient n = new Patient();
        n.setName(name);
        n.setEmail(email);
        patientRepository.save(n);
        return "Saved";
    }
    @GetMapping(path = "/test")
    public void test(){
        System.out.println("success");
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Patient> getAllPatients() {
        // This returns a JSON or XML with the Patients
        return patientRepository.findAll();
    }
}