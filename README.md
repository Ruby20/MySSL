MySSL
=====

Developed a version of SSL implementing the HAndshake and the data phase in Java using the Java Security libraries and 
Bouncycastle Library.
The code contains a client and server socket which are exchanging SSL handshake messages. 
Bouncycastle library is used to generate X509Certificates. Private and Public keys are extracted from the certificate to encrypt and send the nonces to the other side. SHA-1 is used to hash all the messages exchanges at both sides. A successful verification of exchanged hash of  messages is shown.
