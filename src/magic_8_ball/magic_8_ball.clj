(ns magic-8-ball.magic-8-ball)



(defn fortunes []
  (->> ["It is certain!" "It is decidedly so!" "Yes" "Reply hazy try again" "Concentrate & ask again!" "My reply is no" "Outlook is not so good" "Very doubtful!"] count rand-int (nth ["It is certain!" "It is decidedly so!" "Yes" "Reply hazy try again" "Concentrate & ask again!" "My reply is no" "Outlook is not so good" "Very doubtful!"]) print))
