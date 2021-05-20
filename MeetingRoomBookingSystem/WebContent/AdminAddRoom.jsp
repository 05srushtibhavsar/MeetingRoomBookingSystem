<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link
			href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
			rel="stylesheet"
			integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
			crossorigin="anonymous"
		/>
		<title>Add Room</title>
	</head>
	<body class="bg-light text-dark">
		<div class="container">
			<h1 class="text-center m-2">Add Room</h1>
			<form class="border border-primary p-5 mt-5">
				<div class="mb-3">
					<label for="roomId" class="form-label">Room ID</label>
					<select
						class="form-select"
						aria-label="Default select example"
					>
						<option selected>Enter Room ID</option>
						<option value="1">R1</option>
						<option value="2">R2</option>
						<option value="3">R3</option>
					</select>
				</div>
				<div class="mb-3">
					<label for="desc" class="form-label">Descrption</label>
					<input type="text" class="form-control" id="desc" />
				</div>
				<div class="mb-3">
					<label for="desc" class="form-label">Facilities : </label
					><br />
					<div class="form-check form-check-inline">
						<input
							class="form-check-input"
							type="checkbox"
							id="inlineCheckbox1"
							value="wifi"
						/>
						<label class="form-check-label" for="inlineCheckbox1"
							>Wifi</label
						>
					</div>
					<div class="form-check form-check-inline">
						<input
							class="form-check-input"
							type="checkbox"
							id="inlineCheckbox2"
							value="option2"
						/>
						<label class="form-check-label" for="inlineCheckbox2"
							>Projector</label
						>
					</div>
					<div class="form-check form-check-inline">
						<input
							class="form-check-input"
							type="checkbox"
							id="inlineCheckbox3"
							value="option2"
						/>
						<label class="form-check-label" for="inlineCheckbox3"
							>AC</label
						>
					</div>
					<div class="form-check form-check-inline">
						<input
							class="form-check-input"
							type="checkbox"
							id="inlineCheckbox2"
							value="option2"
						/>
						<label class="form-check-label" for="inlineCheckbox2"
							>TV</label
						>
					</div>
				</div>
				<div class="">
					<div class="row">
						<div class="col-md-6">
							<div class="mb-3">
								<label class="form-label" for="pic1"
									>Image 1</label
								>
								<input
									type="file"
									class="form-control"
									id="pic1"
								/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="mb-3">
								<label class="form-label" for="pic1"
									>Image 2</label
								>
								<input
									type="file"
									class="form-control"
									id="pic2"
								/>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="mb-3">
								<label class="form-label" for="pic1"
									>Image 3</label
								>
								<input
									type="file"
									class="form-control"
									id="pic3"
								/>
							</div>
						</div>
						<div class="col-md-6">
							<div class="mb-3">
								<label class="form-label" for="pic1"
									>Image 4</label
								>
								<input
									type="file"
									class="form-control"
									id="pic4"
								/>
							</div>
						</div>
					</div>
				</div>
				<button type="submit" class="btn btn-outline-success">
					Submit
				</button>
			</form>
		</div>
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-b5kHyXgcpbZJO/tY9Ul7kGkf1S0CWuKcCD38l8YkeH8z8QjE0GmW1gYU5S9FOnJ0"
			crossorigin="anonymous"
		></script>
	</body>
</html>