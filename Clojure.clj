(let [num1 (do (Integer/parseInt (read-line)))
    num2 (do (Double/parseDouble (read-line)))] 
  (println (format "%.3f",(/ num1 num2) ) "km/l"))
