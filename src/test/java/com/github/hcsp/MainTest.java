package com.github.hcsp;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    @CaptureSystemOutput
    public void importStringUtilsCorrectly(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(containsStringIgnoringCase("hello"));
        Main.main(null);
    }

    @Test
    public void hasGetMessageMethod() throws Exception {
        Main.class.getDeclaredMethod("getMessage");
    }
}
