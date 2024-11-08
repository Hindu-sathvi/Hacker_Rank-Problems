#nyc_weather.csv contains new york city weather for first few days in the month of January. Write a program that can answer following,
#1.What was the average temperature in first week of Jan
#What was the maximum temperature in first 10 days of Jan
#Code:
arr = []

with open("nyc_weather.csv","r") as f:
    for line in f:
        tokens = line.split(',')
        try:
            temperature = int(tokens[1])
            arr.append(temperature)
        except:
            print("Invalid temperature.Ignore the row")
#1.

sum(arr[0:7])/len(arr[0:7])
#2.
max(arr[0:10])
#We can solve the hashmap using the dictionary.
