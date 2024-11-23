# Mô tả thiết kế bài toán
### Use-cases diagram
![Diagram](https://www.planttext.com/api/plantuml/png/UhzxlqDnIM9HIMbk3bTnTcQUGb5-SIeNLs9oINwHGcXnQX4N5uXKq2qjqBLJq4XEp4akpKaiIGt9BqdCSSpDByqhqOIgm93spFFDpol9WCcdv9VdOIfooozo1hBJyuigDRcu75BpKe1E0G000F__0m00)

### Sequence diagram
##### Calculate Total Amount Sequence Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/V93B3S8m38RldY8Bi40Fg8yLie2RMYXgQak9S-Xi71Y95KX54IKWRfRzFpxvVhsrIJ5gNWAasRE9aWXWbCmJnjKCjklt6PomHWdRRdYEGAnULzCZppOY9tJgXG4EDdCw7noDSHXS3gXaHJ5qIv4fl0Mx_ELkp8MqYazrV7Kl7P5AGKtr1shyqV09zCqFq19FvN4F0000__y30000)

##### Calculate Total In Month Sequence Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/X50x3i8m3DrzYbo02tH0LJjrw9OBkAa5KOCZ9SxGip5mf5w122WgAOBDd_VydjzolTLHC4YwE80uMLR1Hm8OVE8HmwnQtVNDgm7ZMO9tZs7xh85OhCogGPvqG8ven7e6s1BLuRZbLCgWCycXaFQ2hkC-BywmWQoCzKAbJYI5Hjnf582i4oYB_ELzU1k-eGjRRt0aHwOqzkEVVG80DV6Oyxy3003__mC0)

##### Calculate Total For Category Sequence Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/X9713S8m34NldY8Bi40Fg6gaJj05tDIgeWPRIjn3P-F0IAn011I558cRRVtlznFVhxSsAKPTBm4WBPvDb4G0ewmyOToC7NhRlHjmmXebF8VsLGEnUjrCXxmC4JcXKoyCK1hDwLnw6kCmk3MWqY2AePTeSprBHXIotRLlQSnCMZ3IWL65o9n8UN4rFlg-ies_r5MaZpXH8ASruC-3Zjy0BV6KR_00003__mC0)

### Class Diagram
![Diagram](https://www.planttext.com/api/plantuml/png/n5HBRjim4Dtp55pAW9K3284HntM00laXIhefkXXHZCs4v3Wa5I19Ux8kUgHUeHGfsH4j5zb52uiQldapy_Zelx__d5W7nZLA4lieD3LeEI52EsxkWN5w2lgnTE2uujfTWx7Sq3T2_TFkt1hG5fWJgEcctJmpg38fD2-eTKRerIHWpuLrnqd2B6QSUx3TfjaYOcFoR49-4IR1sc4VY_BRfxGorijSWtnvxLh9wSsolBgxMIpBlcee-eoYfX2HMOpJUo7v9IW-7TMusezDTbGCfUJCbOrIO5wo8O51ngt5bACF7z1qbnO7gOOIzMgaoeMUQcmgoIa3oHhf-MxHWPmhRBJB9eSHN_K5QhVELFjRqF3n7_WPceLVhz1FpBh5xcm7f_FU376SsYVu4T1JVl7B48FGOT5L2w6KTynUMS8rJOYcUooTy_e4kkAkVG-ryS61P9rDV7WxzM33OHaMNRH2b1mqvKyDI9jXGQ-g1--HkEilD5s3NI-mRijknRe0eUURZHI-vLwijeB_Oj5goYCwotx_GS6iR4W_S1-FZdxEnlnCnkzCdgVeteKVJXYXtraPypmzFJ9ssthQzxXKchtIVLFaXElQ_u7-0m00__y30000)


# Cách tác giả giải quyết các vấn đề
### Single Responsibility Principle
- Một lớp đảm nhận quá nhiều trách nhiệm có thể được tách ra thành các lớp nhỏ hơn, mỗi lớp đảm nhận một nhiệm vụ duy nhất, nhằm tuân thủ nguyên tắc trách nhiệm đơn lẻ (Single Responsibility Principle) bao gồm:
    * Reading Input
    * Parsing the input in a given format
    * Processing the result
    * Reporting a summary of the result

### Cohesion
- Ban đầu, lớp BankStatementAnalyzer kết nối các thành phần khác nhau như parser, các chức năng tính toán và hiển thị kết quả. Tuy nhiên các chức năng tính toán được khai báo trong lớp này không liên quan trực tiếp đến việc parse dữ liệu hoặc báo cáo. Vì vậy tác giả tách các thao tác tính toán ra thành một lớp riêng gọi là BankStatementProcessor.

### Coupling
- Lớp BankStatementAnalyzer phụ thuộc vào BankStatementCSVParser, tuy nhiên, có thể sau này người dùng muốn làm việc với các định dạng file khác như XML, Json, ... Cách giải quyết là tạo ra một interface BankStatementParser, và BankStatementAnalyzer chỉ cần biết dến interface đó chứ không cần quan tâm cách triển khai thực tế.