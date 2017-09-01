'use strict';

angular.module('meteoreApp').factory('formMagasinService',
		[ '$http', '$q', function($http, $q) {
			var REST_SERVICE_URI = 'http://localhost:8086/localite/';

			var Factory = {
				saveLocalite : saveLocalite
			}

			return Factory;

			function saveLocalite(localite) {
				var deferred = $q.defer();
				$http.post(REST_SERVICE_URI, localite).then(function(response) {
					deferred.resolve(response.data);
				},

				function(errResponse) {
					console.error('ya une erreur ! ');
					deferred.reject(errResponse);
				});

				return deferred.promise;
			}
		} ]);
