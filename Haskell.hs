import Text.Printf(printf)

main :: IO ()
main = do
    a <- readLn
    b <- readLn
    printf "%.3f km/l\n" (a/b :: Double)
