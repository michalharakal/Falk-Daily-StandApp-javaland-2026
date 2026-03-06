package dev.dailystandapp;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void bannerReturnsBootstrapMessage() {
    assertThat(App.banner()).isEqualTo("Daily StandApp bootstrap ready.");
  }

  @Test
  void resolvesModelPathInSiblingModelsDirectory() {
  }
}
