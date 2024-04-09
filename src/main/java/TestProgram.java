import com.beust.jcommander.Parameter;
import com.beust.jcommander.JCommander;

public class TestProgram {

    // Define program's configuration options
    public static class ConfigurationOptions {
        @Parameter(names = {"-h", "--help"}, description = "Print help message", help = true)
        private boolean help;

        @Parameter(names = {"-u", "--username"}, description = "Username", required = true)
        private String username;

        @Parameter(names = {"-p", "--password"}, description = "Password", required = true)
        private String password;
    }

    public static void main(String[] args) {
        // Create an instance of your options class
        ConfigurationOptions options = new ConfigurationOptions();

        // Parse the command-line arguments using JCommander
        JCommander jCommander = JCommander.newBuilder()
                .addObject(options)
                .build();

        jCommander.parse(args);

        System.out.println(options);

        // Print usage and exit if help option is specified
        if (options.help) {
            jCommander.usage();
            System.exit(0);
        }

        // Use the parsed configuration options in your program
        System.out.println("Username: " + options.username);
        System.out.println("Password: " + options.password);
    }
}
