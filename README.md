# Assignment 4: Regular Expressions  
**University of Windsor**  
**Aleena Ali Azeem**  
**Student ID: 110190830**  
**Course: COMP 8547 – Advanced Computing Concepts**  
**Instructor: Dr. Olena Syrotkina**

---

## 🔰 Introduction  
This project implements regular expression tasks in Java for email/phone validation, pattern extraction (dates, URLs, emails, prices), and text parsing.

---

## ✅ Task 1: Email Validation  
**Objective:** Validate email addresses based on strict criteria using regular expressions.

**Implementation:**  
- Regex pattern enforces one `@`, uppercase letters, digits, special characters like `_`, `-`, `.`, and suffix rules.  
- Disallowed invalid formats like consecutive dots, digits in domain, etc.

**Sample Output:**  
**Valid Emails:**  
- Ex_Ample9@my-domain.com  
- TEst_User1@hyphen-site.net  

**Invalid Emails:**  
- user..name@domain.com  
- username@domain123.com  
- Username9@-domain.com  

**Fig 1:**  
![Email Validation Output](Screenshot%202025-03-28%20231141.png)

---

## ✅ Task 2: Phone Number Validation  
**Objective:** Validate Canadian-style phone numbers.

**Implementation:**  
- Format: 10 digits with area code 2–9, proper separators, and length 12 or 14.  
- Invalid: double hyphens, no separators, wrong country code, etc.

**Sample Output:**  
**Valid:** (416) 823-7784, 647-392-4482, 905 625 2324  
**Invalid:** +93-647-333-2211, 289--453-2284, 4165557890  

**Fig 2:**  
![Phone Validation Output](Screenshot%202025-03-28%20231325.png)

---

## ✅ Task 3: Finding Dates in Text  
**Objective:** Extract dates in format `YYYY-MM-DD`.

**Implementation:**  
- Regex pattern to match dates with numeric year, month, and day.

**Sample Output:**  
`[2025-03-28, 2025-03-29, 1990-05-05]`  

**Fig 3:**  
![Date Extraction Output](Screenshot%202025-03-28%20232035.png)

---

## ✅ Task 4: Finding URLs in Text  
**Objective:** Identify and extract URLs using regular expressions.

**Implementation:**  
- Pattern starts with `http` or `https` and captures domain path.

**Sample Output:**  
`[https://google.com, http://example.org]`

**Fig 4:**  
![URL Extraction Output](Screenshot%202025-03-28%20232400.png)

---

## ✅ Task 5: Extracting Phone Numbers from Text  
**Objective:** Capture phone numbers from raw text.

**Implementation:**  
- Regex pattern matches variations with spaces, dashes, or parentheses.

**Sample Output:**  
`[(416) 823-7784, 647-392-4482, 905 625 2324]`

**Fig 5:**  
![Phone Number Extraction Output](Screenshot%202025-03-28%20232807.png)

---

## ✅ Task 6: Extracting Email Addresses from Text  
**Objective:** Detect standard email address patterns in text.

**Implementation:**  
- Pattern matches alphanumeric usernames and domain formats.

**Sample Output:**  
`[test_email@gmail.com, support@company.org]`

**Fig 6:**  
![Email Extraction Output](Screenshot%202025-03-28%20233349.png)

---

## ✅ Task 7: Extracting Prices from Text  
**Objective:** Extract prices like `$12.99`, `14.00 CAD`.

**Implementation:**  
- Regex targets dollar signs, decimal numbers, and currency suffixes.

**Sample Output:**  
`[$12.99, 14.00 CAD, $9.00]`

**Fig 7:**  
![Price Extraction Output](Screenshot%202025-03-28%20233713.png)

---

## ✅ Certificate of Completion  
Include your LinkedIn Learning Certificate for **Learning Regular Expressions** here.

---

## ✅ Source Code  
All `.java` files and corresponding `.txt` files are provided in the `src` directory. Each file is commented for clarity.

---

Let me know if your folder is named something different than `screenshots`, and I’ll adjust the paths! Want me to generate a clean PDF version of this README too?
