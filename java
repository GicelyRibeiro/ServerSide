    alert("First Name must be letters or numbers, up to 20 characters.");
    return;
  }

  if (!/^[A-Za-z0-9]{1,20}$/.test(lastName)) {
    alert("Last Name must be letters or numbers, up to 20 characters.");
    return;
  }

  // Check Email (must have @ and .)
  if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
    alert("Please enter a valid email address.");
    return;
  }

  // Check Phone (must be 10 numbers)
  if (!/^[0-9]{10}$/.test(phone)) {
    alert("Phone Number must be exactly 10 digits.");
    return;
  }

  // Check Eircode (must start with a number, be 6 characters, and alphanumeric)
  if (!/^[0-9][A-Za-z0-9]{5}$/.test(eircode)) {
    alert("Eircode must start with a number and have 6 letters/numbers total.");
    return;
  }

  // If everything is correct
  alert("Form submitted successfully!");
  this.submit();
});
