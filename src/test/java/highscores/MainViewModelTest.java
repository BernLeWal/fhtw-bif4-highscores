package highscores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainViewModelTest {

    @Test
    void saveDataToList_shouldAddData() {
        // Arrange
        MainViewModel mainViewModel = new MainViewModel();
        var lastDataCount = mainViewModel.getData().size();
        final String expectedName = "Susi Sorglos";
        mainViewModel.getCurrentUsername().set( expectedName );
        final String expectedPoints = "100";
        mainViewModel.getCurrentPoints().set( expectedPoints );
        // Act
        mainViewModel.saveDataToList(); // simulate button click
        var expectedDataCount = lastDataCount + 1;
        var currentDataCount = mainViewModel.getData().size();
        assertEquals(expectedDataCount, currentDataCount, "A new item should be added!");
        String currentLastName = mainViewModel.getData().get(expectedDataCount - 1).getUsername();
        String currentLastPoints = mainViewModel.getData().get(expectedDataCount - 1).getPoints();
        assertEquals(expectedName, currentLastName, "The name should be "+expectedName);
        assertEquals(expectedPoints, currentLastPoints, "The points should be "+expectedPoints);
    }
}