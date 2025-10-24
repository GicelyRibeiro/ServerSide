
// Middleware to read form data
app.use(bodyParser.urlencoded({ extended: true }));

// Route to handle form submission
app.post("/submit", (req, res) => {
  const firstName = req.body.firstName;
  const lastName = req.body.lastName;
  const email = req.body.email;
  const phone = req.body.phone;
  const eircode = req.body.eircode;

  // Here you can print or process the data
  console.log("Form Data Received:");
  console.log("First Name:", firstName);
  console.log("Last Name:", lastName);
  console.log("Email:", email);
  console.log("Phone:", phone);
  console.log("Eircode:", eircode);

  res.send("✅ Form submitted successfully and data received!");
});

// Start server
app.listen(PORT, (err) => {
  if (err) {
    console.log("❌ Error starting server:", err);
  } else {
    console.log(`✅ Server is running on http://localhost:${PORT}`);
  }
});
