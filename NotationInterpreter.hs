import Data.List

splitBy d = foldr f [[]] 
  where f c l@(x:xs) | c == d = []:l
                     | otherwise = (c:x):xs

interpret :: String -> Maybe String
interpret x
  | null x = Nothing
  | dPos == Nothing = Nothing
  | otherwise = Just $ "Roll " ++ nd ++ " dice with " ++ ns  ++ " sides" 
  where dPos = 'd' `elemIndex` x
        dx = splitBy 'd' x
        nd = dx !! 0
        ns = dx !! 1
