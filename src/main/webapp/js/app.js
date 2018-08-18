var app = angular.module('sampleApp', [ 'ngRoute' ]);

app.config(function($routeProvider) {
	$routeProvider.when('/', {
		templateUrl : 'addhosp.html'
	}).when('/getall', {
		templateUrl : 'getall.html'
	}).when('/addhosp', {
		templateUrl : 'addhosp.html'
	}).otherwise({
		redirectTo : '/'
	});
});

app.controller('getcontroller', function($scope, $http/* , $rootScope */) {
	/* $rootScope.isLoading = false; */

	$scope.hospitalList = []; // list hospital loading at the first time
	$scope.selectHospital; // selected hospital

	$scope.getfunction = function() {
		/* $rootScope.isLoading = true; */
		var url = "http://localhost:8080/test/hospitals";
		$http.get(url).then(function(response) {
			$scope.hospitalList = response.data;
		});
		/* $rootScope.isLoading = false; */
	};

	$scope.addhosp = function() {
		// prepare data for put messages
		var data = {
			name : $scope.name,
			city : $scope.city,
			rating : $scope.rating
		};
		var url = 'http://localhost:8080/test/addHosp';
		// prepare headers for posting
		var config = {
			headers : {
				'Content-Type' : 'application/json',
				'Accept' : 'text/plain'
			}
		}
		// do posting
		$http.post(url, data, config).then(function(response) {
			$scope.error = false;
			$scope.putMessageAdd = response.data;
			$scope.getfunction();
			$('#addHospitalModal').modal('hide');
		}, function error(response) {
			$scope.error = true;
			$scope.putMessageAdd = "Error!";
			$('#addHospitalModal').modal('hide');
		});
	};

	// the function to select a hospital
	$scope.selectHospital = function(index) {
		if ($scope.hospitalList.length) {
			$scope.selectedHospital = $scope.hospitalList[index];
		}
	};

	// using http PUT to update the changed hospital info
	$scope.updateHospital = function() {
		/* $rootScope.isLoading = true; */
		if ($scope.selectedHospital) {
			// put URL
			var url = 'http://localhost:8080/test/hospital/'
					+ $scope.selectedHospital.id;
			// prepare headers for posting
			var config = {
				headers : {
					'Content-Type' : 'application/json',
					'Accept' : 'text/plain'
				}
			}
			// prepare data for put messages
			var data = $scope.selectedHospital;
			// do posting
			$http.put(url, data, config).then(function(response) {
				$scope.error = false;
				$scope.putMessageEdit = response.data;
				$('#editHospitalModal').modal('hide');
			}, function error(response) {
				$scope.error = true;
				$scope.putMessageEdit = "Error!";
				$('#editHospitalModal').modal('hide');
			});
		}
		/* $rootScope.isLoading = false; */
	}

	// using http Delete to delete the hospital info
	$scope.deleteHospital = function() {
		if ($scope.selectedHospital) {
			// put URL
			var url = 'http://localhost:8080/test/deleteHospital/'
					+ $scope.selectedHospital.id;
			// prepare headers for posting
			var config = {
				headers : {
					'Content-Type' : 'application/json',
					'Accept' : 'text/plain'
				}
			}
			// $http.delete(url, config)
			$http['delete'](url, config).then(function(response) {
				// success callback
				$scope.error = false;
				$scope.putMessageDelete = response.data;
				$scope.getfunction();
				$('#deleteHospitalModal').modal('hide');
			}, function(response) {
				// failure call back
				$scope.error = true;
				$scope.putMessageDelete = "Error!";
				$('#deleteHospitalModal').modal('hide');
			});
		}
	}
});