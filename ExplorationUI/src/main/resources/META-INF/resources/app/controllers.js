/**
 * Created by chongtaiyet on 7/1/15.
 */
var controllers = angular.module('controllers', []);
controllers.controller('EController', ['$scope', '$http', 'Itinerary', function($scope, $http, Itinerary) {
    $scope.title = "Mars Exploration Project"
    $scope.message = "Itinerary: "
    $scope.showMessage = function () {
        //$scope.message = Itinerary.query();
        $http.get('../itinerary').success(function(out) {
            console.log(out);
            $scope.message = $scope.message + out + ', ';
        });
    }
}]);