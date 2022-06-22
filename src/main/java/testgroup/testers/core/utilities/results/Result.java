package testgroup.testers.core.utilities.results;

import lombok.Data;

@Data
public class Result {
private boolean success;
private String message;

    public Result(boolean success) {

    }

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
