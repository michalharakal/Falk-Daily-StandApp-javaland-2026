# Daily StandApp (Workshop Bootstrap)

Dieses Maven-Projekt dient als Startpunkt für den Live-Coding-Teil des Workshops. Es ist bewusst minimal gehalten und bringt nur die Bibliotheken mit, die wir früh im Workshop benötigen:

- Java 25 (über Maven Compiler Release konfiguriert)
- JGit für das Auslesen der Git-Historie
- AssertJ + JUnit 6 für expressives Testen

## Schnellstart

```bash
mvn clean verify
```

Das Ziel `verify` kompiliert den Code und führt die Beispieltests aus.

## Nächste Schritte

1. Git-Historie über JGit laden und in ein Domänenmodell überführen.
2. LLM-Inferenz (z. B. SKaiNET oder JLama/OLama) als Modul ergänzen.
3. MCP-Server anbinden, damit LLMs Git-Daten als Tool Call beziehen können.

Viel Erfolg und viel Spaß beim Workshop!
