CS 305 Software Security Portfolio Artifact
Client Overview and Software Requirements

The client for this project was Artemis Financial, a financial services company that required improvements to the security of its existing web application. Artemis Financial was concerned about protecting sensitive customer data during transmission and storage. The primary issue the company wanted addressed was the presence of security vulnerabilities related to insecure communication, weak cryptographic practices, and the lack of proper certificate management. The goal was to refactor the application to support secure HTTPS communication, implement strong cryptographic hashing, and validate the application against common security vulnerabilities.

Secure Coding and Vulnerability Identification

One area I performed well in was identifying software security vulnerabilities through both manual code review and static analysis. Reviewing the code allowed me to recognize risks such as unencrypted data transmission and insufficient cryptographic protections. Secure coding is important because vulnerabilities can lead to data breaches, loss of customer trust, and regulatory consequences. Implementing software security adds value to a company by protecting sensitive data, ensuring system integrity, and reducing long-term operational and reputational risk.

Vulnerability Assessment Experience

The vulnerability assessment process was both challenging and helpful. Interpreting the results from the dependency-check tool required careful attention to determine which findings were relevant to the refactored code. This process was helpful because it reinforced how automated security tools complement manual review and highlighted the importance of understanding dependency risks in real-world applications.

Layered Security Improvements

I increased the application’s security by implementing HTTPS using SSL certificates, adding a SHA-256 cryptographic hashing mechanism for checksum verification, and ensuring secure key management through a PKCS12 keystore. In the future, I would continue using static analysis tools, dependency scanning, and secure design principles to assess vulnerabilities and determine appropriate mitigation strategies based on severity and impact.

Functional and Security Validation

To ensure the application remained functional and secure, I tested the refactored code by running the application successfully in Eclipse and verifying secure HTTPS communication through the browser. After refactoring, I used checksum verification to confirm the cryptographic functionality and ran dependency-check scans to confirm that no new vulnerabilities were introduced. Reviewing application logs and browser output ensured the application executed without errors.

Tools, Resources, and Coding Practices

The tools and resources used in this project included Java Keytool for certificate generation, Spring Boot for secure application configuration, SHA-256 hashing through Java’s MessageDigest library, and the OWASP dependency-check tool for static security analysis. Secure coding practices such as encryption, certificate management, and layered security controls will be valuable in future coursework and professional development.

Portfolio and Career Relevance

For future employers, this project demonstrates my ability to assess software vulnerabilities, refactor code to improve security, and apply industry-standard cryptographic and secure communication practices. I would highlight the secure HTTPS implementation, checksum verification using SHA-256, and the use of static analysis tools as examples of my hands-on experience with secure software development.
