main :: IO ()
main = do
    let arr = [1, 2, 3, 4, 5]
    let sum = sumArrays arr
    putStrLn $ "Sum of arrays: " ++ show sum

sumArrays :: [Int] -> Int
sumArrays = sum
