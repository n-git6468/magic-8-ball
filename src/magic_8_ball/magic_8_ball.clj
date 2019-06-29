(ns magic-8-ball.magic-8-ball)



(defn fortunes []
  (def fortunes ["It is certain!" "It is decidedly so!" "Yes" "Reply hazy try again" "Concentrate & ask again!" "My reply is no" "Outlook is not so good" "Very doubtful!"])
  (->> fortunes count rand-int (nth fortunes) print))
