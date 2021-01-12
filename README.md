# SimpleLogger

Logger which writes logs to file in format :-

Timestamp;Log level;File name;Function name;Thread name;Actual Log message

Log file is rotated after every 5MB, with a limit of 10 rotations, after which the old logs are automatically wrapped around.

Log4j 1.2.17 is needed. Add it as external JAR.
