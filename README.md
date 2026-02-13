<div align="center">
  <h1>📡 DataIntegrityandDataConversion</h1>
  <p><strong>A Comprehensive Java Suite for Data Communication & Networking Concepts</strong></p>
  
  <p>
    <img src="https://img.shields.io/badge/Java-24-orange?style=flat-square&logo=java&logoColor=white" alt="Java Version"/>
    <img src="https://img.shields.io/badge/License-MIT-yellow?style=flat-square" alt="License: MIT"/>
    <img src="https://img.shields.io/badge/Status-Academic%20Project-blue?style=flat-square" alt="Status"/>
  </p>
</div>

<hr>

<h2>📌 Overview</h2>
<p><strong>DataIntegrityandDataConversion</strong> is an educational Java project that implements six fundamental data communication techniques used in computer networking. From error detection and correction to IP address conversion, this interactive menu-driven application demonstrates how data integrity is maintained during transmission and how data formats are converted across networks.</p>

<p>Whether you're a networking student, educator, or self-learner, this tool provides hands-on experience with real-world data link layer concepts through clean, well-documented code.</p>

<hr>

<h2>✨ Features</h2>

<table>
  <tr>
    <td width="50%">
      <h3>🔹 Bit Stuffing</h3>
      <ul>
        <li>Implements bit-oriented framing technique</li>
        <li>Inserts '0' after five consecutive '1's</li>
        <li>Complete stuffing and de-stuffing operations</li>
        <li><strong>Example:</strong> <code>11111</code> → <code>111110</code></li>
      </ul>
    </td>
    <td width="50%">
      <h3>🔸 Character Stuffing</h3>
      <ul>
        <li>Byte-oriented framing with escape characters</li>
        <li>Handles FLAG and ESC special characters</li>
        <li>Prevents confusion with control sequences</li>
        <li><strong>Example:</strong> <code>FLAG</code> → <code>ESCFLAG</code></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>
      <h3>🔹 Cyclic Redundancy Check (CRC)</h3>
      <ul>
        <li>Powerful error detection using polynomial division</li>
        <li>Computes CRC remainder for any divisor</li>
        <li>Verifies data integrity at receiver end</li>
        <li>Supports custom divisor input</li>
      </ul>
    </td>
    <td>
      <h3>🔸 Parity Checker</h3>
      <ul>
        <li>Simple even parity error detection</li>
        <li>Calculates parity bit for binary data</li>
        <li>Verifies received data with parity</li>
        <li>Quick and lightweight implementation</li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>
      <h3>🔹 Hamming Code</h3>
      <ul>
        <li>Error detection AND correction capability</li>
        <li>Automatically calculates redundant bits at power-of-2 positions</li>
        <li>Locates and corrects single-bit errors</li>
        <li>Shows error position when detected</li>
      </ul>
    </td>
    <td>
      <h3>🔸 IPv4 Converter</h3>
      <ul>
        <li>Bidirectional conversion between decimal and binary IP formats</li>
        <li>Handles dotted decimal notation (e.g., 192.168.1.1)</li>
        <li>Zero-padded 8-bit binary octets</li>
        <li>Perfect for understanding IP addressing</li>
      </ul>
    </td>
  </tr>
</table>

<hr>

<h2>🎯 Menu Interface</h2>

<pre>
Data Integrity and Data Conversion
1. Bit Stuffing
2. Character Stuffing
3. Cyclic Redundancy Check
4. Parity Checker
5. Hamming Code
6. IPv4 Conversion
0. Exit
Enter your choice: _
</pre>

<p>The clean, numbered menu allows you to explore each concept independently with interactive input/output.</p>

<hr>

<h2>📂 Project Structure</h2>

<pre>
datacom/
├── DataIntegrityandDataConversion.java    # Main menu-driven controller
├── BitStuffing.java                        # Bit-oriented framing implementation
├── CharacterStuffing.java                   # Byte-oriented framing with ESC/FLAG
├── CyclicRedundancyCheck.java               # CRC error detection algorithm
├── ParityChecker.java                        # Even parity calculation & verification
├── HammingCode.java                          # Error correction code implementation
└── IPv4Converter.java                         # IP address format conversion
</pre>

<hr>

<h2>🔧 How Each Algorithm Works</h2>

<h3>1. Bit Stuffing</h3>
<p><strong>Algorithm:</strong> Scan the bit stream and insert a '0' after every five consecutive '1's to prevent confusion with flag sequences (usually 01111110).</p>
<pre>
Input:  1111100111110
Output: 11111000111100
</pre>

<h3>2. Character Stuffing</h3>
<p><strong>Algorithm:</strong> Replace each FLAG with ESC+FLAG and each ESC with ESC+ESC to distinguish data from control characters.</p>
<pre>
Input:  ABCFLAGDEF
Output: ABCESCFLAGDEF
</pre>

<h3>3. Cyclic Redundancy Check</h3>
<p><strong>Algorithm:</strong> Perform binary division of the data polynomial by the generator polynomial. Append the remainder as CRC code.</p>
<pre>
Data: 11010011101100
Divisor: 1011
CRC Code: 100
</pre>

<h3>4. Parity Checker</h3>
<p><strong>Algorithm:</strong> Count the number of 1's in the data. For even parity, set parity bit to 1 if count is odd, else 0.</p>
<pre>
Data: 1011010
Parity Bit: 1 (odd number of 1's)
Data with parity: 10110101
</pre>

<h3>5. Hamming Code</h3>
<p><strong>Algorithm:</strong> Insert redundant bits at positions that are powers of 2. Calculate their values based on parity of specific bit groups. Detect and correct errors using syndrome calculation.</p>
<pre>
Data: 1011
Hamming Code: 1010101
Error at position 4: 1011101 → Corrected: 1010101
</pre>

<h3>6. IPv4 Conversion</h3>
<p><strong>Algorithm:</strong> Split the IP by dots, convert each decimal octet to 8-bit binary or vice versa.</p>
<pre>
Decimal: 192.168.1.1
Binary:  11000000.10101000.00000001.00000001
</pre>

<hr>

<h2>🚀 Getting Started</h2>

<h3>Prerequisites</h3>
<ul>
  <li>Java Development Kit (JDK) 8 or higher</li>
  <li>Any Java IDE (NetBeans, IntelliJ, Eclipse) or terminal</li>
</ul>

<h3>Installation & Running</h3>

<ol>
  <li><strong>Clone the repository:</strong>
    <pre><code>git clone https://github.com/ToufiqTushar/DataIntegrityandDataConversion.git</code></pre>
  </li>
  <li><strong>Navigate to project directory:</strong>
    <pre><code>cd DataIntegrityandDataConversion</code></pre>
  </li>
  <li><strong>Compile all Java files:</strong>
    <pre><code>javac datacom/*.java</code></pre>
  </li>
  <li><strong>Run the main class:</strong>
    <pre><code>java datacom.DataIntegrityandDataConversion</code></pre>
  </li>
</ol>

<p>Alternatively, open the project in NetBeans (as it was originally developed) and run <code>DataIntegrityandDataConversion.java</code> directly.</p>

<hr>

<h2>📊 Sample Run</h2>

<pre>
Data Integrity and Data Conversion
1. Bit Stuffing
2. Character Stuffing
3. Cyclic Redundancy Check
4. Parity Checker
5. Hamming Code
6. IPv4 Conversion
0. Exit
Enter your choice: 1

Enter the Bit Stream for Bit Stuffing: 11111011111
Bit Stuffed Bit Stream: 1111100111110
Bit De-stuffed Bit Stream: 11111011111
</pre>

<hr>

<h2>💡 Future Improvements</h2>

<ul>
  <li>✅ <strong>Add input validation</strong> — Prevent crashes from invalid binary strings or IP formats</li>
  <li>✅ <strong>Fix CRC verification logic</strong> — Remove incorrect first-bit comparison</li>
  <li>✅ <strong>Complete character stuffing</strong> — Add ESC character escaping</li>
  <li>🔲 <strong>Add Checksum implementation</strong> — Include Internet Checksum algorithm</li>
  <li>🔲 <strong>Visualize error correction</strong> — Show bit positions and parity calculations</li>
  <li>🔲 <strong>Create unit tests</strong> — Automate verification of all algorithms</li>
  <li>🔲 <strong>Add more error detection codes</strong> — Include LRC, VRC, and Checksum-8</li>
  <li>🔲 <strong>Network simulation</strong> — Simulate transmission with random errors</li>
</ul>

<hr>

<h2>📖 Educational Value</h2>

<p>This project is ideal for:</p>
<ul>
  <li><strong>Computer Networking courses</strong> — Practical demonstration of data link layer concepts</li>
  <li><strong>Lab exercises</strong> — Students can modify and extend the algorithms</li>
  <li><strong>Interview preparation</strong> — Understand how error detection actually works</li>
  <li><strong>Self-study</strong> — Clear, commented code makes learning easy</li>
</ul>

<hr>

<h2>📝 License</h2>

<div align="center">
  <img src="https://img.shields.io/badge/License-MIT-green.svg" alt="License: MIT"/>
  <p>This project is licensed under the MIT License - see the <a href="LICENSE">LICENSE</a> file for details.</p>
  <p>Free for personal, educational, and non-commercial use.</p>
</div>

<hr>

<div align="center">
  <h2>👨‍💻 Author</h2>
  
  <h3>Taufiq Zahan Tushar</h3>
  <p>
    🎓 Computer Science & Engineering Undergraduate<br>
    Green University of Bangladesh
  </p>
  
  <p>
    <a href="mailto:toufiqtushar99@gmail.com">
      <img src="https://img.shields.io/badge/Email-toufiqtushar99%40gmail.com-D14836?style=flat-square&logo=gmail&logoColor=white" alt="Email"/>
    </a>
    <a href="linkedin.com/in/taufiq-zahan-tushar">
      <img src="https://img.shields.io/badge/LinkedIn-Toufiq%20Zahan%20Tushar-0A66C2?style=flat-square&logo=linkedin&logoColor=white" alt="LinkedIn"/>
    </a>
    <a href="https://github.com/ToufiqTushar">
      <img src="https://img.shields.io/badge/GitHub-@ToufiqTushar-181717?style=flat-square&logo=github&logoColor=white" alt="GitHub"/>
    </a>
  </p>
  
  <p>
    ⭐ If you found this project helpful, consider giving it a star!<br>
    📬 Feel free to reach out for questions, suggestions, or collaborations.
  </p>
</div>

<hr>

<div align="center">
  <h3>🖥️ Happy Coding & Networking! 🌐</h3>
  <p><i>Understanding data integrity is the first step to building reliable networks.</i></p>
</div>
