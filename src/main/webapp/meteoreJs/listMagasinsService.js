angular.module('meteoreApp').factory('Localite', Localite);

    Magasin.$inject = ['$resource'];

    function Personne ($resource) {
    	var resourceUrl =  '/localites';
    	return $resource(resourceUrl, {}, {});
    }
};