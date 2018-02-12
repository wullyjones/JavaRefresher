import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class JavaTests {
	
	@Test
	void indexOfArrayTest() {
		// Arrange
		Integer[] dataSet = {0, 1, 2, 3, 4, 3};
		int index;
		
		// Act
		index = Arrays.asList(dataSet).indexOf(3);
		
		// Assert
		assertEquals(index, 5);
		
		
	}

}
