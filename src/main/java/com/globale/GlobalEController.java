package com.globale;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalEController {

	@GetMapping("/order")
	public ResponseEntity saveFcmDeviceRegistrationId() {
		return ResponseEntity.ok("abc");
	}

}
