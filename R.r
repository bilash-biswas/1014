input <- file('stdin', 'r')
a <- as.integer(readLines(input, n=1))
b <- as.numeric(readLines(input, n=1))

write(sprintf("%.3f km/l",a/b),'')
