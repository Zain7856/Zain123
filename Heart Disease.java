document.getElementById('submit-button').addEventListener('click', function() {
    // Get the form data
    let score = 0;
    const form = document.getElementById('quiz-form');
    const formElements = form.elements;

    // Iterate over the form elements and calculate the score
    for (let i = 0; i < formElements.length; i++) {
        if (formElements[i].type === 'radio' && formElements[i].checked) {
            score += parseInt(formElements[i].value);
        }
    }

    // Display the result
    const resultDiv = document.getElementById('result');
    if (score < 80) {
        resultDiv.innerHTML = `<p>Your score is ${score}. You are have Heart Disease . Please consult a doctor.</p>
                                  <p>درجاتك هي  ${score}. أنت مصاب بأمراض القلب. يرجى استشارة الطبيب.</p>`;
        resultDiv.style.color = "red";
    } else {
        resultDiv.innerHTML = `<p>Your score is ${score}. You are healthy!</p>
                               <p>درجاتك هي  ${score}. أنت بصحة جيدة!</p>`;
        resultDiv.style.color = "green";
    }
});
