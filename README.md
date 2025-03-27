<div align="left">
    <img src="https://capsule-render.vercel.app/api?type=wave&color=D1E7B8&height=180&text=Board%20Program&animation=&fontColor=3B3B3B&fontSize=70" 
        style="width: 100%; height: auto; display: block; margin: 0;"/>
</div>
<div align="left">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 🎯 프로젝트 소개 </h2>  
    <div style="font-weight: 700; font-size: 15px; text-align: center; color: #282d33;">
        <p>게시판 프로그램 (CLI)</p>
        <p>이 시스템은 간단한 CLI(명령어 기반) 게시판 프로그램으로, 사용자가 게시글을 작성하고 이를 넘버링하여 목록에 순차적으로 표시할 수 있습니다. 또한, 게시글 삭제 시 자동으로 게시글의 번호가 다시 재조정되어 번호가 연속적으로 유지됩니다. </p>
        <div style="text-align: left;">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 🎯 주요 기능 </h2>
            <strong>게시글 등록:</strong> 사용자가 제목과 내용을 입력하여 게시글을 시스템에 등록하고, 등록된 게시글은 순차적으로 번호가 매겨집니다.<br>
            <strong>게시글 조회:</strong> 등록된 게시글 목록을 번호 순서대로 조회할 수 있으며, 원하는 게시글을 상세히 확인할 수 있습니다.<br>
            <strong>게시글 수정:</strong> 게시글 번호를 기반으로 기존의 게시글 내용을 수정할 수 있습니다.<br>
            <strong>게시글 삭제:</strong> 번호를 통해 특정 게시글을 삭제하면, 나머지 게시글들이 자동으로 번호가 재조정됩니다.<br>
            <strong>게시글 목록 정렬:</strong> 게시글 목록을 번호 순으로 정렬하고, 게시글을 쉽게 관리할 수 있습니다.
        </div>
        <p>이 시스템은 자바만을 이용하여 구현된 CLI 프로그램으로, 게시판 기능을 효율적으로 수행할 수 있습니다. 사용자 편의성 및 실무 환경에서 쉽게 활용될 수 있습니다.</p>
    </div> 
</div>

<div align="left">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 🎮 실행 방법 </h2>
    <div style="font-weight: 700; font-size: 15px; text-align: center; color: #282d33;">
        1️⃣ Java 17+ & MySQL 설치<br>
        2️⃣ hr-finder폴더의 BackupTrigger.SQL, DepartmentTrigger.SQL, procedure.sql 파일 실행  <br>
        3️⃣ 프로그램 실행<br>
        mvn compile exec:java -Dexec.mainClass="com.hr-finder.Main"<br>
        4️⃣ CLI 메뉴 선택 <br><br>
[게시물 목록]<br>
--------------------------------------------------<br>
no&nbsp;&nbsp;	write&nbsp;&nbsp;	date&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	title<br>
--------------------------------------------------<br>
1&nbsp;&nbsp;&nbsp;&nbsp;	youn&nbsp;&nbsp;	2025.03.27&nbsp;&nbsp;	안녕<br>
--------------------------------------------------<br>
메인메뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit<br>
메뉴선택 : _ <br>
    </div>
</div> <br>
<div align="left">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 📁 프로젝트 폴더 구조 </h2>
</div>

```plaintext
│── .github
│── .idea
│── out
│── src
│  ├── DashBoard
│  │  ├── Board           #Board DTO
│  │  ├── BoardExamole    #Board Controller
│  │  ├── Main            #실행파일 
```


<div align="left">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 🛠️ Tech Stacks </h2>
    <div style="margin: 0 auto; text-align: center;">
        <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=Java&logoColor=white">
        <img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=Git&logoColor=white">
        <img src="https://img.shields.io/badge/Github-181717?style=for-the-badge&logo=Github&logoColor=white">
    </div>
</div>

<div align="left">
    <h2 style="border-bottom: 1px solid #d8dee4; color: #282d33;"> 🧑‍💻 Contact me </h2>
    <p>문의 사항이 있으시면 언제든지 연락 주세요!</p>
