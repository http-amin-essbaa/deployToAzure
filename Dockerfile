FROM openjdk:17-jdk-alpine

# Créer un utilisateur non-root
RUN addgroup -g 1001 -S spring && adduser -u 1001 -S spring -G spring

# Copier le JAR
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

# Changer le propriétaire
RUN chown spring:spring app.jar
USER spring:spring

# Exposer le port
EXPOSE 8080

# Commande de démarrage
ENTRYPOINT ["java","-jar","/app.jar"]