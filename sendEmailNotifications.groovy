def call (String emailsubject,String email body,string recipients) {
    emailext (
        subject: "${emailsubject}",
        body: """${email body}""",
        to: String.join (',', recipients),
        mimeType: 'text/html'
    )
    echo "Email sent with subject: ${emailsubject} to ${recipients}"
}
