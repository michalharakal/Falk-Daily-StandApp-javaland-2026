package dev.dailystandapp;

import sk.ainet.apps.kllama.java.GenerationConfig;
import sk.ainet.apps.kllama.java.KLlamaJava;
import sk.ainet.apps.kllama.java.KLlamaSession;

import java.nio.file.Path;
import java.nio.file.Paths;

public final class App {
    private static final String MODEL_FILENAME = "tinyllama-1.1b-chat-v1.0.Q8_0.gguf";
    private static final Path MODEL_PATH =
            Paths.get("..", "..", "models", MODEL_FILENAME).normalize().toAbsolutePath();

    private App() {
    }

    public static void main(String[] args) {
        System.out.println(banner());
        // System Prompt: You are a helpful assistant that can analyze a git history and help summarize it for a daily standup report.
        try (KLlamaSession session = KLlamaJava.loadGGUF(MODEL_PATH, "you are a mathmatician that can solve simple calculations. answer short.")) {
            GenerationConfig config = GenerationConfig.builder()
                    .maxTokens(128)
                    .temperature(0.7f)
                    .build();

            // Stream tokens to stdout as they are generated
            session.generate("2 + 2 = ", config,
                    token -> System.out.print(token));
            System.out.println();
        }
    }

    static String banner() {
        return "Daily StandApp bootstrap ready.";
    }

}
